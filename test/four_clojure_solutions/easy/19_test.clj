(ns four-clojure-solutions.easy.19-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.19 :refer [last-el]]))

(deftest last-el-test
  (testing "Test #1"
    (is (= (last-el [1 2 3 4 5]) 5)))
  (testing "Test #2"
    (is (= (last-el '(5 4 3)) 3)))
  (testing "Test #3"
    (is (= (last-el ["b" "c" "d"]) "d"))))
