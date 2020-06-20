(ns four-clojure-solutions.medium.44-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.medium.44 :refer [rotate]]))

(deftest rotate-test
  (testing "Test #1"
    (is (= (rotate 2 [1 2 3 4 5]) '(3 4 5 1 2))))
  (testing "Test #2"
    (is (= (rotate -2 [1 2 3 4 5]) '(4 5 1 2 3))))
  (testing "Test #3"
    (is (= (rotate 6 [1 2 3 4 5]) '(2 3 4 5 1))))
  (testing "Test #4"
    (is (= (rotate 1 '(:a :b :c)) '(:b :c :a))))
  (testing "Test #5"
    (is (= (rotate -4 '(:a :b :c)) '(:c :a :b)))))
