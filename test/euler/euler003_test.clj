(ns euler.euler003-test
  (:require [clojure.test :refer :all]
            [euler.euler003 :refer [solve]]))

(deftest euler003
  (testing "result = 6857"
    (is (= (solve) 6857))))
