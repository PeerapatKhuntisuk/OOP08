package lab.oodp.io.numchar;

import java.io.*;

public class CharCounter {
	
	int numE = 0;
    int total = 0;
    
    

    public int getNumE() {
		return numE;
	}

	public int getTotal() {
		return total;
	}

    public void setNumE(int numE) {
        this.numE = numE;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void start() {

        printNumEsWithFileReader();

    }

    private void printNumEsWithFileReader() {
    	
    	//TODO: read file and count Es and total number of character, uncomment sysout below

        File file = new File("input1.txt");

        try
        {
            FileReader reader = new FileReader(file);

            int data = 0;

            while ((data = reader.read()) != -1)
            {
                if(data == 101 || data == 69 )
                {
                    setNumE(getNumE()+1);
                }

                setTotal(getTotal()+1);
            }

            System.out.println("Number of e/E's: " + numE + " out of " + total);

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new CharCounter().start();
    }

}
