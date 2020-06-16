(ns four-clojure-solutions.easy.41-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.41 :refer [nth-drop]]))

(deftest intrps-test
  (testing "Test #1"
    (is (= (nth-drop [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])))
  (testing "Test #2"
    (is (= (nth-drop [:a :b :c :d :e :f] 2) [:a :c :e])))
  (testing "Test #3"
    (is (= (nth-drop [1 2 3 4 5 6] 4) [1 2 3 5 6]))))
