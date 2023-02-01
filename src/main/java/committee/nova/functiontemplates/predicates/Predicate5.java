package committee.nova.functiontemplates.predicates;

@FunctionalInterface
public interface Predicate5<T1, T2, T3, T4, T5> {
    boolean test(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5);

    default Predicate5<T1, T2, T3, T4, T5> negate() {
        return (t1, t2, t3, t4, t5) -> !test(t1, t2, t3, t4, t5);
    }
}
