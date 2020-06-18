(ns four-clojure-solutions.easy.99-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.99 :refer [seq-digits]]))

(deftest seq-digits-test
  (testing "Test #1"
    (is (= (seq-digits 1 1) [1])))
  (testing "Test #2"
    (is (= (seq-digits 99 9) [8 9 1])))
  (testing "Test #3"
    (is (= (seq-digits 999 99) [9 8 9 0 1]))))
