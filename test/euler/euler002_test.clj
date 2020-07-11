(ns euler.euler002-test
  (:require [clojure.test :refer :all]
            [euler.euler002 :refer [solve]]))

(deftest euler002
  (testing "result = 4613732"
    (is (= (solve) 4613732))))
