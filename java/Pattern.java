class Pattern
{
public static void main(string[]args)
{
int line=5;
int star=5;
for(int i=0;i<line;i++)
{
for(int j=0;j<star;j++)
{
if(i==0||j==4||i==4||j==0)
system.out.print("*");
else
system.out.print(" ");
}
system.out.println(" ");
}
}
}