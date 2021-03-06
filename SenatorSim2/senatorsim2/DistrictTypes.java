package senatorsim2;


class CoastalDistrict implements District {

  public int dType;
  public double pop;
  public double budget;
  public double death;
  public String dName;
  public CoastalDistrict(int dType)
  {
    this.dType = dType;
  }
  //All the setters and getters for population
  //***March 12, 2017 - Took out dType passing because we have classes for each district so dont need to specify here. - Shanil Lobanwala
  public void setName()
  {
     dName = "Coastal District";
  }
  public String getName()
  {
      return dName;
  }
  public void setPop(double decision)
  {
     pop = 16600 + decision;
  }
  public void updatePop(double decision)
  {
    pop = decision;
  }
  public double getPop()
  {
    return pop;
  }
  public void setBudget(double decision)
  {
     budget = 10000000 + decision;
  }
  public void updateBudget(double decision)
  {
    budget = decision;
  }
  public double getBudget()
  {
    return budget;
  }
  public void setDeath(double decision)
  {
     death = pop*.00823 + decision;
  }
  public void updateDeath(double decision)
  {
    death = decision;
  }
  public double getDeath()
  {
    return death;
  }
  public String getDistrict()
  {    
    return "District Type: " + dName + "\nPopulation: " + Double.toString(pop) + "\nBudget: " + Double.toString(budget) 
      + "\nDeaths: " + Double.toString(death);
  }
}






class UrbanDistrict implements District {
    
    public int dType;
    public double pop;
    public double budget;
    public double death;
    public String dName;
    public UrbanDistrict(int dType)
    {
        this.dType = dType;
    }
    //All the setters and getters for population
    //***March 12, 2017 - Took out dType passing because we have classes for each district so dont need to specify here. - Shanil Lobanwala
    
    public void setName()
    {
        dName = "Urban District";
    }
    public String getName()
    {
      return dName;
    }
    public void setPop(double decision)
    {
        pop = 50000000 + decision;
    }
    public void updatePop(double decision)
    {
        pop = decision;
    }
    public double getPop()
    {
        return pop;
    }
    public void setBudget(double decision)
    {
        budget = 100000000 + decision;
    }
    public void updateBudget(double decision)
    {
        budget = decision;
    }
    public double getBudget()
    {
        return budget;
    }
    public void setDeath(double decision)
    {
        death = pop*.00823 + decision;
    }
    public void updateDeath(double decision)
    {
        death = decision;
    }
    public double getDeath()
    {
        return death;
    }
    public String getDistrict()
    {
        return "District Type: " + dName + 
               "\nPopulation: " + Double.toString(pop) + 
               "\nBudget: " + Double.toString(budget)
             + "\nDeaths: " + Double.toString(death);
    }
}




class RuralDistrict implements District {
    
    public int dType;
    public double pop;
    public double budget;
    public double death;
    public String dName;
    public RuralDistrict(int dType)
    {
        this.dType = dType;
    }
    //All the setters and getters for population
    //***March 12, 2017 - Took out dType passing because we have classes for each district so dont need to specify here. - Shanil Lobanwala
    public void setName()
    {
        dName = "Rural District";
    }
    public String getName()
    {
      return dName;
    }
    public void setPop(double decision)
    {
        pop = 2000 + decision;
    }
    public void updatePop(double decision)
    {
        pop = decision;
    }
    public double getPop()
    {
        return pop;
    }
    public void setBudget(double decision)
    {
        budget = 3000000 + decision;
    }
    public void updateBudget(double decision)
    {
        budget = decision;
    }
    public double getBudget()
    {
        return budget;
    }
    public void setDeath(double decision)
    {
        death = pop*.00823 + decision;
    }
    public void updateDeath(double decision)
    {
        death = decision;
    }
    public double getDeath()
    {
        return death;
    }
    public String getDistrict()
    {
        return "District Type: " + dName + 
               "\nPopulation: " + Double.toString(pop) + 
               "\nBudget: " + Double.toString(budget)
             + "\nDeaths: " + Double.toString(death);
    }
}