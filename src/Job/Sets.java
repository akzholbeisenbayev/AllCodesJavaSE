package Job;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sets
{
    private List<Integer> elements;

    public Sets(Integer... elements) {
        this(Arrays.asList(elements));
    }

    private Sets(List<Integer> elements) {
        this.elements = elements;
    }

    public Sets intersect(Sets other) {
        return new Sets(elements.stream()
                .filter(other.elements::contains)
                .collect(Collectors.toList()));
    }

    public Sets unify(Sets other) {
        return new Sets(Stream.concat(this.elements.stream(), other.elements.stream())
                .distinct()
                .collect(Collectors.toList()));
    }

    @Override
    public String toString() {
        return "Elements = " + elements;
    }
    public static void main(String[] args)
    {

        Sets set1 = new Sets(1, 2, 3, 9, 15);
        Sets set2 = new Sets(2, 3, 4, 5);

        System.out.println("Intersection: " + set1.intersect(set2));
        System.out.println("Union: " + set1.unify(set2));
    }
}
