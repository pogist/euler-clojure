(ns euler.euler009-test
  (:require [clojure.test :refer :all]
            [euler.euler009 :refer [solve]]))

(deftest euler009
  (testing "result = 31875000"
    (is (= (solve) 31875000))))
