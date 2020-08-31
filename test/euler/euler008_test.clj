(ns euler.euler008-test
  (:require [clojure.test :refer :all]
            [euler.euler008 :refer [solve]]))

(deftest euler008
  (testing "result = 23514624000"
    (is (= (solve) 23514624000))))
