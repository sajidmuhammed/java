import java.io.File;
public class files {
    static void recursivePrint(File[] arr,int index,int level){
        if(index==arr.length)
            return;
        for(int i=0;i<level;i++)
            System.out.print("\t");
        if(arr[index].isFile())
            System.out.println(arr[index].getName());
        else if(arr[index].isDirectory())
        {
            System.out.println("[" +arr[index].getName() + "]");
            recursivePrint(arr[index].listFiles(),0,level+1);
        }
        recursivePrint(arr,++index,level);
    }
    public static void main(String[] args){
        String maindirpath="C:\\Users\\ATHIRA\\IdeaProjects\\AthiraProject1\\src\\arithmetic";
        File maindir=new File(maindirpath);
        if(maindir.exists() && maindir.isDirectory()){
            File arr[]=maindir.listFiles();
            System.out.println("***************************************");
            System.out.println("Files from main directory :" +maindir);
            System.out.println("***************************************");
           recursivePrint(arr,0,0);
        }
    }
}
 
