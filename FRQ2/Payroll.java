public class Payroll {
    private int[] itemsSold; // number of items sold by each employee
    private double[] wages; // wages to be computed in part (b)
    
    //Creates a Payroll object
     
    //PRECONDITIONS: items != null, items.length >= 3
    
    public Payroll(int[] items) {
      itemsSold = items;
      wages = new double[items.length];
    }
   
    //Returns the bonus threshold as described in part (a).
     
    public double computeBonusThreshold() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int one : itemsSold) {
            if (one < min) {
                min = one;
            }
    
            if (one > max) {
            max = one;
            }
        }
        
        int total = 0;
        for (int one : itemsSold) {
            total += one;
        }    
        return (total - min - max)/(itemsSold.length - 2);
}

   
    /* Computes employee wages as described in part (b) and stores
       them in wages. The parameter fixedWage represents the fixed
       amount each employee is paid per day. The parameter
       perItemWage represents the amount each employee is paid per
       item sold.
     */
    public void computeWages(double fixedWage, double perItemWage) {
        double threshold = computeBonusThreshold();
        for (int i = 0; i < itemsSold.length; i ++) {
            double baseWage = fixedWage + perItemWage * itemsSold[i];
            if (itemsSold[i] > threshold) {
                 wages[i] = baseWage * 1.1;
            } else {
                wages[i] = baseWage;
            }
        }
    }    

    public double[] getWages() {
        return wages;
    }    
}
  