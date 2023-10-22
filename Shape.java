public enum Shape {
    CIRCLE(5.0), SQUARE(4.0), TRIANGLE(3.0);

    private double sideLength; 

   
    Shape(double sideLength) {
        this.sideLength = sideLength;
    }

    
    public double calculateArea() {
        switch (this) {
            case CIRCLE:
                return Math.PI * Math.pow(sideLength / 2, 2);
            case SQUARE:
                return Math.pow(sideLength, 2);
            case TRIANGLE:
                return (Math.sqrt(3) / 4) * Math.pow(sideLength, 2);
            default:
                return 0.0;
        }
    }

  
    public double calculatePerimeter() {
        switch (this) {
            case CIRCLE:
                return Math.PI * sideLength;
            case SQUARE:
                return 4 * sideLength;
            case TRIANGLE:
                return 3 * sideLength;
            default:
                return 0.0;
        }
    }
}

