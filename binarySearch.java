int[] data;
int size;

public boolean binarySearch(int target) 
{
     int low = 0;
     int high = size - 1;
      
     while(high >= low) {
          int middle = (low + high) / 2;
          if(data[middle] == target) {
              return true;
          }
          if(data[middle] < target) {
              low = middle + 1;
          }
          if(data[middle] > target) {
              high = middle - 1;
          }
     }
     return false;
}
