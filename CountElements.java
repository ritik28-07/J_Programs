import java.util.Random;
import java.lang.Math;
public class CountElements {
	int NUM_INPUT_ELEMS = 10;
	int HIGHEST_NUM     = 5;
	public static void main(String[] args)
	{
		CountElements cE = new CountElements();
		cE.scanElements();
	}
	public void scanElements()
	{
		int [] iArr = new int[NUM_INPUT_ELEMS];
		for(int i=0;i<NUM_INPUT_ELEMS; i++)
		{
			iArr[i] = (int)(Math.random()*(HIGHEST_NUM-1));
		}
		//int [] iArr = rand.ints(NUM_INPUT_ELEMS, 0, HIGHEST_NUM); 
		//int [] iArr = new int[] {1,0,3,4,1,1,0,2,1,1};
		int [] oArr = new int[HIGHEST_NUM];

		//startTime
		long startTime = System.currentTimeMillis();

		//slowCount(iArr, oArr);
		fastCount(iArr,oArr);

		long endTime = System.currentTimeMillis();
		//endTime
		calTime(startTime,endTime);
	}

	public void fastCount(int iArr[],int oArr[]){
		for(int i=0;i<NUM_INPUT_ELEMS;i++)
		{
			oArr[iArr[i]]++;
		}
		//printArray(iArr);
		//printArray(oArr);
	}
	
	public void slowCount(int iArr[], int oArr[])
	{
		int i,j,count=0;
		for(i=0;i<HIGHEST_NUM;i++)
		{
			count=0;
			for(j=0;j<NUM_INPUT_ELEMS;j++)
			{
				if(i==iArr[j])
				{
					count++;
				}
			}
			oArr[i]=count;
		}
		//printArray(iArr);
		//printArray(oArr);
	}
	
	void calTime(long startTime, long endTime)
	{
		long totalElapsed = endTime - startTime ;
		System.out.print(totalElapsed);
	}
	
	void printArray(int pArr[])
	{
		int i;
		System.out.print("Arr = [ ");
		for(i=0;i<pArr.length;i++)
		{
			System.out.print(pArr[i]+", ");
		}
		System.out.println(" ] ");
	}
}
