(ns four-clojure-solutions.easy.31-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.31 :refer [pack]]))

(deftest pack-test
  (testing "Test #1"
    (is (= (pack [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))))
  (testing "Test #2"
    (is (= (pack [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))))
  (testing "Test #3"
    (is (= (pack [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4]))))))
