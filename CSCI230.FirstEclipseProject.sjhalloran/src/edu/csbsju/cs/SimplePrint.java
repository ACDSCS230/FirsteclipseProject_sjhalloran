/**
 * 
 */
package edu.csbsju.cs;

/**
 * @author sjhalloran
 *
 */
public class SimplePrint {

	/**
	 * @param args
	 */
	private String pName;
	private int pAge;
	/**
	 * @param pName
	 * @param pAge
	 */
	public SimplePrint(String pName, int pAge) {
		super();
		this.pName = pName;
		this.pAge = pAge;
	}
	/**
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}
	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}
	/**
	 * @return the pAge
	 */
	public int getpAge() {
		return pAge;
	}
	/**
	 * @param pAge the pAge to set
	 */
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sam Halloran");
		for(int i=0; i<args.length;i++){
			System.out.println("args[ " + i + " ] = " + args[i] );
			}
	}

}
