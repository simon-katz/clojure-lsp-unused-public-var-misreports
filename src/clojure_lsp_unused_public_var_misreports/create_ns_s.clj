(ns clojure-lsp-unused-public-var-misreports.create-ns-s
  (:require [clojure.java.io :as io]))

(comment
  (dotimes [i 1000]
    (let [filename
          (format
           "src/clojure_lsp_unused_public_var_misreports/generated/ns_%03d.clj"
           i)]
      (io/make-parents filename)
      (spit filename
            (format "(ns clojure-lsp-unused-public-var-misreports.generated.ns-%03d)

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(def foo 42)"
                    i)))))
