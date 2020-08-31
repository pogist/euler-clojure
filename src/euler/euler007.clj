(ns euler.euler007)

(defn divisible? [n d]
  (zero? (rem n d)))

(def primes
  (let [ps (atom [])]
    (for [n (iterate inc 2)
          :when (not-any? #(divisible? n %) (filter #(<= % (Math/sqrt n)) @ps))]
      (do (swap! ps conj n) n))))

(defn solve []
  (nth primes 10000))
