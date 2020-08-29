(ns euler.euler003)

(defn prime-factors [n]
  (loop [n' n d 2 fs []]
    (cond
     (<= n' 1) fs
     (> (* d d) n') (conj fs n')
     (zero? (rem n' d)) (recur (/ n' d) d (conj fs d))
     :else (recur n' (inc d) fs))))

(defn solve []
  (last (prime-factors 600851475143N)))
