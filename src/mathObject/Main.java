package mathObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Math math=new Math();
        System.out.println(math.sum(5, 13));
        System.out.println(math.sub(5, 13));
        System.out.println(math.divide(12,5));	    
        System.out.println("Bölüm :" + math.divide(13,15));
        System.out.println(math.getPi());
        System.out.println(math.areaOfCicle(5));
	    System.out.println(math.areaOfCicle(4));
	    System.out.println(math.volumeOfsphere(3)); 
        System.out.println(math.areaOfRectangularprism(3, 4, 6));
	    System.out.println("üçgenin Alaný :" +math.areaOfTriangle(5,4,2));
	    System.out.println(math.areaOfRectangularprism(4, 5));
	    System.out.println(math.areaOfCicle(0)
}
