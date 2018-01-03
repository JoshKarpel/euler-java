import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class ProjectEuler {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Which problem would you like to solve?   ");
        String which_solver = String.format("%03d", reader.nextInt());

        Map<String, solvers.Solver> solverMap = getSolverMap();
        solvers.Solver solver = solverMap.get(which_solver);
        if (solver == null) {
            System.out.println("Couldn't find a solver for problem " + which_solver);
            System.exit(0);
        }
        System.out.println("Answer: " + solver.solve());
    }

    private static Map<String, solvers.Solver> getSolverMap() {
        Map<String, solvers.Solver> solverMap = new HashMap<>();

        solverMap.put("001", solvers.P001::solve);

        return solverMap;
    }
}
