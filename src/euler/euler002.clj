(ns euler.euler002)

(defn fib
  ([]
   (fib 1 2))
  ([n m]
   (lazy-seq (cons n (fib m (+ n m))))))

(defn solve []
  (->> (fib)
       (take-while #(< % 4000000))
       (filter even?)
       (reduce +)))
