/*In this code the variable times is primitive and the object myCount
is refernce so when we pass myCount in increment method then its
location is sent to the method so it changes its orignal value by
1 in every loop and its value become 101 after 100 loops while
when we pass times in the increment method then 0 is sent to the 
method and in each loop its value changes from 0 to 1 but as times
is a local variable so this change is not reflected in the main 
method and in next loop again it pass times = 0 in the method and 
after 100 loops it value remains 0.
 */
public class Test
{
public static void main(String[] args)
{
Count myCount = new Count();
int times = 0;

for (int i = 0; i < 100; i++) 
    increment(myCount, times);

System.out.println("count is " + myCount.count);
System.out.println("times is " + times);
}

public static void increment(Count c, int times)
{
c.count++;
times++;
}
}
