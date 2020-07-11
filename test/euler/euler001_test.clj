(ns euler.euler001-test
  (:require [clojure.test :refer :all]
            [euler.euler001 :refer [solve]]))

(deftest euler001 
  (testing "result = 233168"
    (is (= (solve) 233168))))
