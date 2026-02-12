import java.util.Stack;
/* * 
 * LC 71: Simplify Path
 * 
 * You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. 
 * Your task is to transform this absolute path into its simplified canonical path.

 * The rules of a Unix-style file system are as follows:

 * A single period '.' represents the current directory.
 * A double period '..' represents the previous/parent directory.
 * Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
 * Any sequence of periods that does not match the rules above should be treated as a valid directory or file name. For example, '...' and '....' are valid directory or file names.
 * The simplified canonical path should follow these rules:
 * 
 * The path must start with a single slash '/'.
 * Directories within the path must be separated by exactly one slash '/'.
 * The path must not end with a slash '/', unless it is the root directory.
 * The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
 * Return the simplified canonical path.
*/
public class SimplifyPath {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String result = "";
        String[] paths = path.split("/");

        for (String p : paths) {
            if (!stack.isEmpty() && "..".equals(p))
                stack.pop();
            else if (!"".equals(p) && !".".equals(p) && !"..".equals(p))
                stack.push(p);
        }

        if (stack.isEmpty())
            return "/";
        while (!stack.isEmpty())
            result += "/" + stack.removeFirst();

        return result;
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/.../a/../b/c/../d/./"));
    }
}