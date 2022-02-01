package ITFest2021;

import java.io.Serializable;

public class Request implements Serializable
{
    private String name;
    private String surname;
    private String middlename;
    String phoneNumber;
    String address;
    int age;
    String maritalStatus;
    int countOfChildren;
    String maintenancePerson;
    String houseType;
    String employmentType;
    String governmentsHelp;
    String whyNotHaveHelp;
    String familyProblems;
    String reEducating;
    private String VolunteerName;
    private String VolunteerSurname;
    private String VolunteerMiddlename;
    String VolunteersPhoneNumber;

    public Request(String name, String surname, String middlename, String phoneNumber, String address, int age, String maritalStatus, int countOfChildren, String maintenancePerson, String houseType, String employmentType, String governmentsHelp, String whyNotHaveHelp, String familyProblems, String reEducating, String volunteerName, String volunteerSurname, String volunteerMiddlename, String volunteersPhoneNumber) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.countOfChildren = countOfChildren;
        this.maintenancePerson = maintenancePerson;
        this.houseType = houseType;
        this.employmentType = employmentType;
        this.governmentsHelp = governmentsHelp;
        this.whyNotHaveHelp = whyNotHaveHelp;
        this.familyProblems = familyProblems;
        this.reEducating = reEducating;
        VolunteerName = volunteerName;
        VolunteerSurname = volunteerSurname;
        VolunteerMiddlename = volunteerMiddlename;
        VolunteersPhoneNumber = volunteersPhoneNumber;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", countOfChildren=" + countOfChildren +
                ", maintenancePerson='" + maintenancePerson + '\'' +
                ", houseType='" + houseType + '\'' +
                ", employmentType='" + employmentType + '\'' +
                ", governmentsHelp='" + governmentsHelp + '\'' +
                ", whyNotHaveHelp='" + whyNotHaveHelp + '\'' +
                ", familyProblems='" + familyProblems + '\'' +
                ", reEducating='" + reEducating + '\'' +
                ", VolunteerName='" + VolunteerName + '\'' +
                ", VolunteerSurname='" + VolunteerSurname + '\'' +
                ", VolunteerMiddlename='" + VolunteerMiddlename + '\'' +
                ", VolunteersPhoneNumber='" + VolunteersPhoneNumber + '\'';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getCountOfChildren() {
        return countOfChildren;
    }

    public void setCountOfChildren(int countOfChildren) {
        this.countOfChildren = countOfChildren;
    }

    public String getMaintenancePerson() {
        return maintenancePerson;
    }

    public void setMaintenancePerson(String maintenancePerson) {
        this.maintenancePerson = maintenancePerson;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getGovernmentsHelp() {
        return governmentsHelp;
    }

    public void setGovernmentsHelp(String governmentsHelp) {
        this.governmentsHelp = governmentsHelp;
    }

    public String getWhyNotHaveHelp() {
        return whyNotHaveHelp;
    }

    public void setWhyNotHaveHelp(String whyNotHaveHelp) {
        this.whyNotHaveHelp = whyNotHaveHelp;
    }

    public String getFamilyProblems() {
        return familyProblems;
    }

    public void setFamilyProblems(String familyProblems) {
        this.familyProblems = familyProblems;
    }

    public String getReEducating() {
        return reEducating;
    }

    public void setReEducating(String reEducating) {
        this.reEducating = reEducating;
    }

    public String getVolunteerName() {
        return VolunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        VolunteerName = volunteerName;
    }

    public String getVolunteerSurname() {
        return VolunteerSurname;
    }

    public void setVolunteerSurname(String volunteerSurname) {
        VolunteerSurname = volunteerSurname;
    }

    public String getVolunteerMiddlename() {
        return VolunteerMiddlename;
    }

    public void setVolunteerMiddlename(String volunteerMiddlename) {
        VolunteerMiddlename = volunteerMiddlename;
    }

    public String getVolunteersPhoneNumber() {
        return VolunteersPhoneNumber;
    }

    public void setVolunteersPhoneNumber(String volunteersPhoneNumber) {
        VolunteersPhoneNumber = volunteersPhoneNumber;
    }
}
