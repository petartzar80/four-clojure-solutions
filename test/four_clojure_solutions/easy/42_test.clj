(ns four-clojure-solutions.easy.42-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.42 :refer [factorial]]))

(deftest factorial-test
  (testing "Test #1"
    (is (= (factorial 1) 1)))
  (testing "Test #2"
    (is (= (factorial 3) 6)))
  (testing "Test #3"
    (is (= (factorial 5) 120)))
  (testing "Test #4"
    (is (= (factorial 8) 40320))))
