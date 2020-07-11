(ns euler.euler001)

(defn is-mult-of? [n x] (zero? (rem x n)))

(def pred 
  #(or
    (is-mult-of? 3 %)
    (is-mult-of? 5 %)))

(defn solve []
  (->> (range 1000) (filter pred) (reduce +)))
