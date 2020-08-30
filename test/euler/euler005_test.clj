(ns euler.euler005-test
  (:require [clojure.test :refer :all]
            [euler.euler005 :refer [solve]]))

(deftest euler005
  (testing "result = 232792560"
    (is (= (solve) 232792560))))
