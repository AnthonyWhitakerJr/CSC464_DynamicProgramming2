package edu.nku.whitakera2.csc464.homework6;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {

    private List<Project> contents;
    private final int liquidityMaxCapacity;
    private int liquidityUsedCapacity;
    private final int officeWorkMaxCapacity;
    private int officeWorkUsedCapacity;
    private int profit;
    private final int programmingWorkMaxCapacity;
    private int programmingWorkUsedCapacity;

    public Knapsack(int liquidityMaxCapacity, int officeWorkMaxCapacity, int programmingWorkMaxCapacity){
        contents = new ArrayList<Project>();
        this.liquidityMaxCapacity = liquidityMaxCapacity;
        this.officeWorkMaxCapacity = officeWorkMaxCapacity;
        this.programmingWorkMaxCapacity = programmingWorkMaxCapacity;
        liquidityUsedCapacity = 0;
        officeWorkUsedCapacity = 0;
        programmingWorkUsedCapacity = 0;
        profit = 0;
    }

    public boolean addProject(Project project){
        if(updateCapacities(project)){
            contents.add(project);
            return true;
        }

        return false;
    }

    /**
     * @return List of Projects in this Knapsack
     */
    public List<Project> getContents() {
        return contents;
    }

    /**
     * @return Current amount of liquidity available.
     */
    public int getLiquidityAvailableCapacity() {
        return liquidityMaxCapacity - liquidityUsedCapacity;
    }

    /**
     * @return Maximum amount of liquidity available.
     */
    public int getLiquidityMaxCapacity() {
        return liquidityMaxCapacity;
    }

    /**
     * @return Amount of liquidity in use by current contents.
     */
    public int getLiquidityUsedCapacity() {
        return liquidityUsedCapacity;
    }

    /**
     * @return Current amount of office work available.
     */
    public int getOfficeWorkAvailableCapacity() {
        return officeWorkMaxCapacity - officeWorkUsedCapacity;
    }

    /**
     * @return Maximum amount of office work available.
     */
    public int getOfficeWorkMaxCapacity() {
        return officeWorkMaxCapacity;
    }

    /**
     * @return Amount of office work in use by current contents.
     */
    public int getOfficeWorkUsedCapacity() {
        return officeWorkUsedCapacity;
    }

    /**
     * @return Amount of profit offered by current contents.
     */
    public int getProfit() {
        return profit;
    }

    /**
     * @return Current amount of programming work available.
     */
    public int getProgrammingWorkAvailableCapacity() {
        return programmingWorkMaxCapacity - programmingWorkUsedCapacity;
    }

    /**
     * @return Maximum amount of programming work available.
     */
    public int getProgrammingWorkMaxCapacity() {
        return programmingWorkMaxCapacity;
    }

    /**
     * @return Amount of programming work in use by current contents.
     */
    public int getProgrammingWorkUsedCapacity() {
        return programmingWorkUsedCapacity;
    }

    public boolean updateCapacities(Project project){
        if(getLiquidityAvailableCapacity() - project.getAmountLiquidity() >= 0)
            if(getOfficeWorkAvailableCapacity() - project.getAmountOfficeWorkHours() >= 0)
                if(getProgrammingWorkAvailableCapacity() - project.getAmountProgrammingWorkHours() >= 0){
                    liquidityUsedCapacity += project.getAmountLiquidity();
                    officeWorkUsedCapacity += project.getAmountOfficeWorkHours();
                    programmingWorkUsedCapacity += project.getAmountProgrammingWorkHours();
                    profit += project.getAmountProfit();
                    return true;
                }
        return false;
    }


}
