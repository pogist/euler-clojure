(ns euler.euler007-test
  (:require [clojure.test :refer :all]
            [euler.euler007 :refer [solve]]))

(deftest euler007
  (testing "result = 104743"
    (is (= (solve) 104743))))
