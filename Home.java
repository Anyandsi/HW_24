package com.company;

public class Home implements Comparable<Home> {
    protected int houseNum;
    protected String street;
    protected int floorsNum;
    protected int habitants;

    public Home(int houseNum, String street, int floorsNum, int habitants) {
        this.houseNum = houseNum;
        this.street = street;
        this.floorsNum = floorsNum;
        this.habitants = habitants;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getFloorsNum() {
        return floorsNum;
    }

    public void setFloorsNum(int floorsNum) {
        this.floorsNum = floorsNum;
    }

    public int getHabitants() {
        return habitants;
    }

    public void setHabitants(int habitants) {
        this.habitants = habitants;
    }

    @Override
    public int hashCode() {
        return houseNum;
    }


    @Override
    public String toString() {
        return "Home{" +
                "houseNum=" + houseNum +
                ", street='" + street + '\'' +
                ", floorsNum=" + floorsNum +
                ", habitants=" + habitants +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Home home = (Home) o;
        if (habitants == home.habitants && !street.equals(home.street))
            return false; //habitant num is same, but streets are different
        if (habitants == home.habitants && houseNum != home.houseNum)
            return false; //habitant num is same, but numbers are different
        if (houseNum == home.houseNum && !street.equals(home.street))
            return false; //numbers are same, but streets are different
        if (street.equals(home.street) && houseNum != home.houseNum)
            return false; //streets are same, but numbers are different
        return (street.equals(home.street) && houseNum == home.houseNum && habitants == home.habitants);

    }

//sorting by the street name
//    @Override
//    public int compareTo(Home o) {
//        return Integer.compare(this.street.length(), o.street.length());
//    }
//

    //sorting by the house's number
//    @Override
//    public int compareTo(Home o) {
//        return Integer.compare(this.houseNum, o.houseNum);
//    }

    //sorting by the habitants number
    @Override
    public int compareTo(Home o) {
        return Integer.compare(this.habitants, o.habitants);
    }


}
