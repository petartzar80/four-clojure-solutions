(ns four-clojure-solutions.easy.66-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.66 :refer [divisor]]))

(deftest divisor-test
  (testing "Test #1"
    (is (= (divisor 2 4) 2)))
  (testing "Test #2"
    (is (= (divisor 10 5) 5)))
  (testing "Test #3"
    (is (= (divisor 5 7) 1)))
  (testing "Test #4"
    (is (= (divisor 1023 858) 33))))
