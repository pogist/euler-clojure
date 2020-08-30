(ns euler.euler004)

(defn digits [n]
  (loop [quo n ds []]
    (if (zero? quo)
      ds
      (recur (quot quo 10)
             (conj ds (rem quo 10))))))

(defn palindrome? [n]
  (let [ds (digits n)]
    (= ds (reverse ds))))

(defn solve []
  (reduce
   #(loop [xs (range %2 100 -1) higher-prod %1]
     (if (empty? xs)
       higher-prod
       (let [x (first xs) prod (* %2 x)]
         (recur (rest xs)
                (if (and (palindrome? prod) (> prod higher-prod))
                  prod
                  higher-prod)))))
   0
   (range 999 100 -1)))
