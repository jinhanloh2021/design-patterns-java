public class Client {
    public static void main(String[] args) {
        File root1 = createTreeOne();
        root1.ls();
        System.out.println("*******************************");

        File root2 = createTreeTwo();
        root2.ls();
    }

    private static File createTreeOne() {
        Directory dir1 = new Directory("Dir1");
        File file1 = new BinaryFile("File1", 1000);

        dir1.addFile(file1);

        Directory dir2 = new Directory("Dir2");
        File file2 = new BinaryFile("File2", 100);
        File file3 = new BinaryFile("File3", 300);

        dir2.addFile(file2);
        dir2.addFile(file3);
        dir2.addFile(dir1);

        return dir2;
    }

    private static File createTreeTwo() {
        return new BinaryFile("Another file", 200);
    }
}