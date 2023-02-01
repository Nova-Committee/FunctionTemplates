package committee.nova.functiontemplates.predicates;

@FunctionalInterface
public interface Predicate4<T1, T2, T3, T4> {
    boolean test(T1 t1, T2 t2, T3 t3, T4 t4);

    default Predicate4<T1, T2, T3, T4> negate() {
        return (t1, t2, t3, t4) -> !test(t1, t2, t3, t4);
    }
}
