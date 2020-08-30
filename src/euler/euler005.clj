(ns euler.euler005)

(defn prime-factors [n]
  (loop [n' n d 2 fs []]
    (cond
     (<= n' 1) fs
     (> (* d d) n') (conj fs n')
     (zero? (rem n' d)) (recur (/ n' d) d (conj fs d))
     :else (recur n' (inc d) fs))))

(defn pow [x e]
  (reduce * (repeat e x)))

(defn solve []
  (->> (range 20 1 -1)
       (map #(frequencies (prime-factors %)))
       (reduce #(merge-with max %1 %2) {})
       (map #(pow (key %) (val %)))
       (reduce *)))
