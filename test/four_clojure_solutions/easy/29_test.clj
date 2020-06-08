(ns four-clojure-solutions.easy.29-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.29 :refer [capital]]))

(deftest capital-test
  (testing "Test #1"
    (is (= (capital "HeLlO, WoRlD!") "HLOWRD")))
  (testing "Test #2"
    (is (empty? (capital "nothing"))))
  (testing "Test #3"
    (is (= (capital "$#A(*&987Zf") "AZ"))))
