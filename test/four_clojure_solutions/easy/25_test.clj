(ns four-clojure-solutions.easy.25-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.25 :refer [return-odd]]))

(deftest return-odd-test
  (testing "Test #1"
    (is (= (return-odd #{1 2 3 4 5}) '(1 3 5))))
  (testing "Test #2"
    (is (= (return-odd [4 2 1 6]) '(1))))
  (testing "Test #3"
    (is (= (return-odd [2 2 4 6]) '())))
  (testing "Test #4"
    (is (= (return-odd [1 1 1 3]) '(1 1 1 3)))))
