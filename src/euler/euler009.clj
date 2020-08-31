(ns euler.euler009)

(defn find-triplets
  "Finds the pythagorean triplets that match the given sum"
  [expected-sum]
  (for [a (range 1 expected-sum)
        b (range a expected-sum)
        :let [c (Math/sqrt (+ (* a a) (* b b)))]
        :when (= (+ a b c) (double expected-sum))]
    [a b c]))

(defn solve []
  (->> (find-triplets 1000) flatten (map int) (reduce *)))
