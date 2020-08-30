(ns euler.euler006)

(defn square [x]
  (* x x))

(defn sum-of-squares [coll]
  (reduce + (map square coll)))

(defn square-of-sum [coll]
  (square (reduce + coll)))

(defn solve []
  (let [xs (range 1 101)
        sum (sum-of-squares xs)
        square (square-of-sum xs)]
    (- square sum)))
