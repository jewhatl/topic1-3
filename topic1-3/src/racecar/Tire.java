package racecar;
import java.util.Scanner;
public class Tire
{
    private int psi = 0;
        
    /**
     * @return the psi
     */
    public int getPsi()
    {
        return this.psi;
    }
    /**
     * @param psi the psi to set
     */
    public void setPsi(int psi)
    {
        this.psi = psi;
    }
    
    public void checkPressure(int psiCheck) {
        Scanner input = new Scanner(System.in);
        if(psiCheck < 32 && psiCheck > 32) {
            System.out.println("Incorrect tire pressure");
            while(psiCheck != 32) {
                System.out.print("Enter tire psi: ");
                psiCheck = input.nextInt();
            }
        }
    }
}
