import java.util.Map;
import java.util.HashMap;

public class ProjectEuler {
    public static void main(String[] args) {
        Map<String, solvers.Solver> solverMap = getSolverMap();

        solvers.Solver solver = solverMap.get(args[0]);
        if (solver == null) {
            System.out.println("Couldn't find a solver for problem " + args[0]);
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
