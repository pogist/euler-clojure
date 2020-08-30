(ns euler.euler004-test
  (:require [clojure.test :refer :all]
            [euler.euler004 :refer [solve]]))

(deftest euler004
  (testing "result = 906609"
    (is (= (solve) 906609))))
