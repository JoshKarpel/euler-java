import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProjectEuler {
    public static void main(String[] args) {
        String whichSolver = getWhichSolverFromInput();

        Map<String, solvers.Solver> solverMap = getSolverMap();
        solvers.Solver solver = solverMap.get(whichSolver);
        if (solver == null) {
            System.out.println("Couldn't find a solver for problem " + whichSolver);
            System.exit(0);
        }

        long startTime = System.currentTimeMillis();
        long answer = solver.solve();
        long endTime = System.currentTimeMillis();
        double duration = ((double) (endTime - startTime)) / 1_000_000.0;

        System.out.println(String.format("Answer: %d  |  Elapsed Time: %f s", answer, duration));
    }

    private static Map<String, solvers.Solver> getSolverMap() {
        Map<String, solvers.Solver> solverMap = new HashMap<>();

        solverMap.put("001", solvers.P001::solve);
        solverMap.put("002", solvers.P002::solve);
        solverMap.put("003", solvers.P003::solve);
        solverMap.put("004", solvers.P004::solve);
        solverMap.put("006", solvers.P006::solve);
        solverMap.put("012", solvers.P012::solve);
        solverMap.put("016", solvers.P016::solve);
        solverMap.put("021", solvers.P021::solve);

        return solverMap;
    }

    private static String getWhichSolverFromInput() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Which problem would you like to solve?   ");
        return String.format("%03d", reader.nextInt());
    }
}
