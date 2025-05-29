package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;

    private MidDeveloper[] midDevelopers;

    private SeniorDeveloper[] seniorDevelopers;


    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    public HRManager(long id, String name, double salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper){
        if (juniorDevelopers == null) {
            System.out.println("JuniorDevelopers list is not initialized.");
            return;
        }

        if(index < 0 || index > juniorDevelopers.length-1){
            System.out.println("Invalid index: " + index );
        }

        if(juniorDevelopers[index] == null){
            juniorDevelopers[index] = juniorDeveloper;
        } else System.out.println("The index is already in use");


    }


    public void addEmployee(int index, MidDeveloper midDeveloper){
        if (midDevelopers == null) {
            System.out.println("MidDevelopers list is not initialized.");
            return;
        }

        if(index < 0 || index > midDevelopers.length-1){
            System.out.println("Invalid index: " + index );
        }

        if(midDevelopers[index] == null){
            midDevelopers[index] = midDeveloper;
        } else System.out.println("The index is already in use");


    }


    public void addEmployee(int index, SeniorDeveloper seniorDeveloper){
        if (seniorDevelopers == null) {
            System.out.println("SeniorDevelopers list is not initialized.");
            return;
        }

        if(index < 0 || index > midDevelopers.length-1){
            System.out.println("Invalid index: " + index );
        }

        if(midDevelopers[index] == null){
            seniorDevelopers[index] = seniorDeveloper;
        } else System.out.println("The index is already in use");


    }
}
