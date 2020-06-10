(ns four-clojure-solutions.easy.34-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.34 :refer [implement-range]]))

(deftest implement-range-test
  (testing "Test #1"
    (is (= (implement-range 1 4) '(1 2 3))))
  (testing "Test #2"
    (is (= (implement-range -2 2) '(-2 -1 0 1))))
  (testing "Test #3"
    (is (= (implement-range 5 8) '(5 6 7)))))
