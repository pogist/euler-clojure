(ns euler.euler006-test
  (:require [clojure.test :refer :all]
            [euler.euler006 :refer [solve]]))

(deftest euler006
  (testing "result = 25164150"
    (is (= (solve) 25164150))))
