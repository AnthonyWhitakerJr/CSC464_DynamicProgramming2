package edu.nku.whitakera2.csc464.homework6;

public class Project {

    private String projectName;
    private int amountLiquidity;
    private int amountOfficeWorkHours;
    private int amountProgrammingWorkHours;
    private int amountProfit;

    public Project(String projectName, int amountLiquidity, int amountOfficeWorkHours, int amountProgrammingWorkHours, int amountProfit){
        this.projectName = projectName;
        this.amountLiquidity = amountLiquidity;
        this.amountOfficeWorkHours = amountOfficeWorkHours;
        this.amountProgrammingWorkHours = amountProgrammingWorkHours;
        this.amountProfit = amountProfit;
    }

    /**
     * @return Name of the project.
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @return Amount of money (liquidity) that will be demanded by the project in thousands of dollars.
     */
    public int getAmountLiquidity() {
        return amountLiquidity;
    }

    /**
     * @return Amount of office staff labor that will be demanded by the project, measured in work weeks.
     */
    public int getAmountOfficeWorkHours() {
        return amountOfficeWorkHours;
    }

    /**
     * @return Ammount of programmer labor that will be demanded by the project, also measured in work weeks.
     */
    public int getAmountProgrammingWorkHours() {
        return amountProgrammingWorkHours;
    }

    /**
     * @return Net profit (in thousands) that the company can expect from engaging in the project.
     */
    public int getAmountProfit() {
        return amountProfit;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(projectName);
        sb.append(" ");
        sb.append(amountLiquidity);
        sb.append(" ");
        sb.append(amountOfficeWorkHours);
        sb.append(" ");
        sb.append(amountProgrammingWorkHours);
        sb.append(" ");
        sb.append(amountProfit);
        return sb.toString();
    }

}
