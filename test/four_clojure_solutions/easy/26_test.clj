(ns four-clojure-solutions.easy.26-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.26 :refer [fib]]))

(deftest fib-test
  (testing "Test #1"
    (is (= (fib 3) '(1 1 2))))
  (testing "Test #2"
    (is (= (fib 6) '(1 1 2 3 5 8))))
  (testing "Test #3"
    (is (= (fib 8) '(1 1 2 3 5 8 13 21)))))
