import java.util.*;

public class TopologicalSort {
    public static List<Integer> topologicalSortBFS(int numCourses, int[][] prerequisites) {
        List<Integer> result = new ArrayList<>();

        // Create an adjacency list to represent the graph
        List<List<Integer>> graph = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        int[] inDegree = new int[numCourses];

        // Build the graph and calculate in-degrees
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prereq = prerequisite[1];
            graph.get(prereq).add(course);
            inDegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        // Enqueue nodes with in-degree of 0
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int course = queue.poll();
            result.add(course);

            for (int nextCourse : graph.get(course)) {
                inDegree[nextCourse]--;
                if (inDegree[nextCourse] == 0) {
                    queue.offer(nextCourse);
                }
            }
        }

        // If all courses are taken, return the result; otherwise, there is a cycle.
        return (result.size() == numCourses) ? result : new ArrayList<>();
    }

    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = {{1,0}, {2,0}, {3,1}, {3,2}};

        List<Integer> topologicalOrder = topologicalSortBFS(numCourses, prerequisites);

        if (topologicalOrder.isEmpty()) {
            System.out.println("The graph contains a cycle and cannot be topologically sorted.");
        } else {
            System.out.println("Topological Order: " + topologicalOrder);
        }
    }
}
